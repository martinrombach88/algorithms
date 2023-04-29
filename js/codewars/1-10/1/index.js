class PaginationHelper {
  constructor(collection, itemsPerPage) {
    this.collection = collection;
    this.itemsPerPage = itemsPerPage;
    this.pCount = this.pageCount();
    // The constructor takes in an array of items and a integer indicating how many
    // items fit within a single page
    this.paginArray = [];
  }
  itemCount() {
    return this.collection.length;
    // returns the number of items within the entire collection
  }
  pageCount() {
    return Math.round(this.collection.length / this.itemsPerPage);
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

    // determines what page an item is on. Zero based indexes
    // this method should return -1 for itemIndex values that are out of range
  }
}

const example = new PaginationHelper([1, 2, 3, 4, 5, 6], 4);
// example.itemCount();

var helper = new PaginationHelper(["a", "b", "c", "d", "e", "f"], 4);
console.log(helper.pageCount(), "should ==2"); //should == 2
console.log(helper.itemCount(), "should ==6");
console.log(helper.pageItemCount(0), "should ==4"); //should == 4
console.log(helper.pageItemCount(1), "should ==2"); // last page - should == 2
console.log(helper.pageItemCount(2), "should ==-1"); // should == -1 since the page is invalid

// // pageIndex takes an item index and returns the page that it belongs on
// helper.pageIndex(5); //should == 1 (zero based index)
// helper.pageIndex(2); //should == 0
// helper.pageIndex(20); //should == -1
// helper.pageIndex(-10); //should == -1
