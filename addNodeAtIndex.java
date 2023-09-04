function LinkedList() {
  var length = 0;
  var head = null;

  var Node = function(element) {
    this.element = element;
    this.next = null;
  };

  this.size = function() {
    return length;
  };

  this.head = function() {
    return head;
  };

  this.add = function(element) {
    var node = new Node(element);
    if (head === null) {
      head = node;
    } else {
      var currentNode = head;

      while (currentNode.next) {
        currentNode = currentNode.next;
      }

      currentNode.next = node;
    }
    length++;
  };

  // Only change code below this line -------------------------------------------------------------
  this.addAt = function(index,element) {
    if((index < 0) || (index >= length)){
      return false;
    }

    // the index is in an OK range, so add the node

    // create a new node with the element in it
    var newNode = new Node(element);

    currentIndex = 0;
    currentPtr = head;
    let previousPtr = currentPtr; // initialize?

    while(currentIndex < index){
      previousPtr = currentPtr;
      currentPtr = currentPtr.next;
      currentIndex++;
    }

    // we are now pointing at the node where we want the new node to be,
    // based on the element number

    if(index===0){
      head = newNode;
    }
    previousPtr.next = newNode;
    newNode.next = currentPtr;

    // update the length of the linked list
    length++;
  };
  // Only change code above this line -------------------------------------------------------------
}
