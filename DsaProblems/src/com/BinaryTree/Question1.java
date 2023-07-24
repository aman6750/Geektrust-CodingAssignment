package com.BinaryTree;
import java.util.*;

public class Question1 {
  
  static class Node{
    int data;
    Node left;
    Node right;
    
    Node(int data){
      this.data = data;
      this.left = null;
      this.right = null;
    }
    
  }
  
  static class BinaryTree{
    static int index = -1;
    
    public static Node buildTree(int[] nodes){
      
      index++;
      
      if(nodes[index]==-1){
        return null;
      }
      
      Node node = new Node(nodes[index]);
      node.left = buildTree(nodes);
      node.right = buildTree(nodes);
      
      return node;
      
    }
    
  }
  
  
    public static void main(String[] args) {
      
      int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
      
      BinaryTree tree = new BinaryTree();
      
      Node newNode = tree.buildTree(nodes);
      
      System.out.println(newNode.data);
      
  }
  
  
  
}
