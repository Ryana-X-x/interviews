think of it like a book's index vs reading page by page/
- Without an index, a query does a full table scan — O(n).
- A **B+ Tree** index lets you binary-search down to the row in O(log n), because B+ trees keep data sorted and balanced, with all actual data at the leaf level (making range queries fast too — that's _why_ B+ trees specifically, not just B trees).
- Cost: every ==`INSERT`/`UPDATE`/`DELETE`== now must also update the index structure — so indexes speed up reads at the cost of writes. This is why you don't index every column blindly.