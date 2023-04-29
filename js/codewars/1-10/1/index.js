class PaginationHelper {
  constructor(collection, itemsPerPage) {
    this.collection = collection;
    this.itemsPerPage = itemsPerPage;
    // The constructor takes in an array of items and a integer indicating how many
    // items fit within a single page
  }
  itemCount() {
    return this.collection.length;
    // returns the number of items within the entire collection
  }
  pageCount(collection, itemsPerPage) {
    return Math.round(this.collection.length / this.itemsPerPage);
    // returns the number of pages
  }
  pageItemCount(pageIndex) {
    //if pageIndex doesn't exist, return -1
    console.log(this);
    let paginArray = [];
    if (pageIndex > this.pageCount()) {
      return -1;
    } else {
      while (this.collection.length != 0) {
        paginArray.push(this.collection.splice(0, this.itemsPerPage));
      }
      // return paginArray[pageIndex].length;
      return paginArray;

      //helper -> 0: 4, 1: 2
      //pagArray = [[item1, item2, item3, item4], [item5, item6]]
      //then return pagArray[index].length
      //push the items into pagination, objects that represent the pagination?
      //arrays in arrays are better?
      //split an array up by the pagination?
    }

    // returns the number of items on the current page. page_index is zero based.
    // this method should return -1 for pageIndex values that are out of range
  }
  pageIndex(itemIndex) {
    // determines what page an item is on. Zero based indexes
    // this method should return -1 for itemIndex values that are out of range
    //use findIndex
  }
}

const example = new PaginationHelper([1, 2, 3, 4, 5, 6], 4);
// example.itemCount();

var helper = new PaginationHelper(["a", "b", "c", "d", "e", "f"], 4);
console.log(helper.pageCount());
//should == 2
helper.itemCount(); //should == 6
console.log(helper.pageItemCount(0)); //should == 4
console.log(helper.pageItemCount(1)); // last page - should == 2
console.log(helper.pageItemCount(2)); // should == -1 since the page is invalid

// var helper2 = new PaginationHelper(
//   ["a", "b", "c", "d", "e", "f", "a", "b", "c", "d", "e", "f"],
//   4
// );
// console.log(helper2.pageCount());

// // pageIndex takes an item index and returns the page that it belongs on
// helper.pageIndex(5); //should == 1 (zero based index)
// helper.pageIndex(2); //should == 0
// helper.pageIndex(20); //should == -1
// helper.pageIndex(-10); //should == -1
