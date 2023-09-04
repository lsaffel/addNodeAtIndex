From the freecodecamp problem at:

https://www.freecodecamp.org/learn/coding-interview-prep/data-structures/add-elements-at-a-specific-index-in-a-linked-list

**Add Elements at a Specific Index in a Linked List**

Let's create a addAt(index,element) method that adds an element at a given index. Just like how we remove elements at a given index, we need to keep track of the currentIndex as we traverse the linked list. When the currentIndex matches the given index, we would need to reassign the previous node's next property to reference the new added node. And the new node should reference the next node in the currentIndex. Returning to the conga line example, a new person wants to join the line, but he wants to join in the middle. You are in the middle of the line, so you take your hands off of the person ahead of you. The new person walks over and puts his hands on the person you once had hands on, and you now have your hands on the new person.

Create an addAt(index,element) method that adds an element at a given index. 

Return false if an element could not be added. 

Note: Remember to check if the given index is a negative or is longer than the length of the linked list.

---------------------------------------------------------------

I believe that my code works, on paper, but the freecodecamp page does not accept everything. I'm not sure why.

The freecodecamp solution, from here. Some of the code was already given in the problem:

https://forum.freecodecamp.org/t/freecodecamp-challenge-guide-add-elements-at-a-specific-index-in-a-linked-list/301619


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

  // Only change code below this line
  this.addAt = (index, element) => {
    if (index < 0 || index >= length) {
      return false;
    }

    let node = head;
    if (index > 0) {
      let i = 0;
      while (i + 1 !== index) {
        node = node.next;
        i++;
      }
    }

    const newNode = new Node(element);
    newNode.next = node.next;

    if (index === 0) {
      head = newNode;
    } else {
      node.next = newNode;
    }

    length++;
  };
  // Only change code above this line
}
