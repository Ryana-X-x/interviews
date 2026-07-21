The gap: 1000 - 200 = 800 requests/sec that the DB simply cannot absorb synchronously. If you write directly to the DB per request, you'll queue up, time out, or crash the DB.

**Reasoning through solutions, not just listing them:**

1. **Decouple write from request** — put a message queue (Kafka/RabbitMQ) between the API and DB. The API accepts the request, publishes an event, and returns immediately (202 Accepted). A consumer drains the queue at whatever pace the DB can handle (200/s). This converts a bursty 1000/s problem into a smooth 200/s worker problem — the queue absorbs the burst.
2. **Batch writes** — instead of 200 individual INSERT statements per second, batch them (e.g., insert 50 rows in one statement every 250ms). Fewer round trips and transaction overhead means your _effective_ write throughput goes up even on the same hardware.
3. **Cache reads** (Redis) — this doesn't directly fix the write bottleneck, but if a chunk of your 1000 req/s are actually reads (common in most APIs), offloading them to a cache means the DB's limited capacity is fully available for writes.
4. **Rate limiting** — if the business can tolerate it, throttle at the API gateway so you never accept more than the system can eventually process — protects against total collapse under extreme spikes.
5. **Scale the DB** — read replicas, sharding, or a faster storage engine, if the above still isn't enough long-term.


The senior-level answer ties these together: **queue + async processing is the primary fix**, batching optimizes the drain rate, caching removes unnecessary DB load, and scaling is the last resort after software-level fixes are exhausted.