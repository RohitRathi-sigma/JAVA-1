// Implement various operations of Stack.

public class Stack {
private int[] stack;
private int top;
public Stack(int size) {
stack = new int[size];
top = -1;
}
public void push(int val) {
if (top >= stack.length - 1) {
System.out.println("Stack Overflow");
} else {
stack[++top] = val;
System.out.println(val + " pushed to stack");
}
}
public void pop() {
if (top < 0) {
System.out.println("Stack Underflow");
} else {
System.out.println(stack[top--] + " popped from stack");
}
}
public void printStack() {
if (top < 0) {
System.out.println("Stack is empty");
} else {
System.out.print("Stack elements are: ");
for (int i = 0; i <= top; i++) {
System.out.print(stack[i] + " ");
}
System.out.println();
}
}
public static void main(String[] args) {
Stack stack = new Stack(100);
stack.push(10);
stack.push(20);
stack.push(30);
stack.printStack();
stack.pop();
stack.printStack();
}
}