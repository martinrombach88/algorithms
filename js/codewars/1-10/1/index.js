class PaginationHelper {
  constructor(collection, itemsPerPage) {
    this.collection = collection;
    this.itemsPerPage = itemsPerPage;
    this.pCount = this.pageCount();
    this.paginArray = [];
    // The constructor takes in an array of items and a integer indicating how many
    // items fit within a single page
  }
  itemCount() {
    return this.collection.length;
    // returns the number of items within the entire collection
  }
  pageCount() {
    return Math.ceil(this.collection.length / this.itemsPerPage);
    // returns the number of pages
  }
  pageItemCount(pageIndex) {
    const collectionCopy = this.collection;
    while (collectionCopy.length != 0) {
      this.paginArray.push(collectionCopy.splice(0, this.itemsPerPage));
    }
    if (this.paginArray[pageIndex]) {
      return this.paginArray[pageIndex].length;
    } else {
      return -1;
    }
    // returns the number of items on the current page. page_index is zero based.
    // this method should return -1 for pageIndex values that are out of range
  }

  pageIndex(itemIndex) {
    const collectionCopy = this.collection;
    if (this.paginArray.length === 0) {
      while (collectionCopy.length != 0) {
        this.paginArray.push(collectionCopy.splice(0, this.itemsPerPage));
      }
    }
    const array = this.paginArray;
    let count = 0;
    for (let i = 0; i < array.length; i++) {
      for (let j = 0; j < array[i].length; j++) {
        if (count === itemIndex) {
          return i;
        }
        count++;
      }
    }
    return -1;
    // determines what page an item is on. Zero based indexes
    // this method should return -1 for itemIndex values that are out of range
  }
}
