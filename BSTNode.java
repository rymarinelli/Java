//---------------------------------------------------------------------------
// BSTNode.java               by Dale/Joyce/Weems                   Chapter 7
//
// Implements nodes holding info of class <T> for a binary search tree.
//---------------------------------------------------------------------------

import java.util.*;

//package support;

public class BSTNode<K, V>{
        K key;
        V value;
        BSTNode<K, V> left;
        BSTNode<K, V> right;
        int count; 
        
        
        public BSTNode(K k){
           key=k;
           left=null;
           right=null;
        }


        public BSTNode(K k, V v) {
                key = k;
                value = v;
        }


        public V value() {
                return value;
        }


        public K key() {
                return key;
        }


        public BSTNode<K, V> left() {
                return left;
        }


        public BSTNode<K, V> right() {
                return right;
        }


        public void setLeft(BSTNode<K, V> BSTNode ) {
                left = BSTNode;               
        }


        public void setRight(BSTNode<K, V> BSTNode) {
                right = BSTNode;              
        }


        public void setValue(V secondValue) {
                value = secondValue;
        }


        public void setKey(K secondKey) {
                key = secondKey;
        }
}