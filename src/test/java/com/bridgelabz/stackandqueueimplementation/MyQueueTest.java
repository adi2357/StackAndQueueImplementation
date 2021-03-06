package com.bridgelabz.stackandqueueimplementation;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class MyQueueTest {

	@Test
	public void given3NumberWhenAddedToQueueShouldHaveFirstAddedNodeAtTop() {
		MyNode<Integer> firstNode = new MyNode(56);
		MyNode<Integer> secondNode = new MyNode(30);
		MyNode<Integer> thirdNode = new MyNode(70);

		MyQueue myQueue = new MyQueue();
		myQueue.enqueue(firstNode);
		myQueue.enqueue(secondNode);
		myQueue.enqueue(thirdNode);

		AllNode top = myQueue.peek();
		myQueue.printQueue();
		Assert.assertEquals(firstNode, top);
	}

	@Test
	public void given3NumberInQueueWhenDequeuedShouldMatchedFirstAddedNode() {
		MyNode<Integer> firstNode = new MyNode(56);
		MyNode<Integer> secondNode = new MyNode(30);
		MyNode<Integer> thirdNode = new MyNode(70);

		MyQueue myQueue = new MyQueue();
		myQueue.enqueue(firstNode);
		myQueue.enqueue(secondNode);
		myQueue.enqueue(thirdNode);

		AllNode dequeuedNode = myQueue.dequeue();
		myQueue.printQueue();
		Assert.assertEquals(firstNode, dequeuedNode);
	}

}
