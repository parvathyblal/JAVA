import java.util.LinkedList;
public class RemoveAll {
public static void main(String[] args) {
// Create a LinkedList
LinkedList<String> linkedList = new LinkedList<>();
// Add elements to the LinkedList
linkedList.add("Apple");
linkedList.add("Banana");
linkedList.add("Cherry");
linkedList.add("Date");
// Display the initial LinkedList
System.out.println("Initial LinkedList: " + linkedList);
// Remove all elements from the LinkedList
linkedList.clear();
// Display the LinkedList after removal
System.out.println("LinkedList after removing all elements: " + linkedList);
}
}
