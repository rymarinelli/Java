import java.util.*;
import ch08.maps.*;

public class MapTree<K extends Comparable<K>, V> implements MapInterface<K,V>{
        private BSTNode<K, V> root; // Root of BST
        private int count; // Size of BST

        /** Constructor */
        public MapTree() {
                root = null;
                count = 0;
        }

        /** Reinitialize tree */
        public void clear() {
                root = null;
                count = 0;
        }

        /**
         * Insert a record into the tree.
         *
         * @param k
         *            Key value of the record.
         * @param e
         *            The record to insert.
         */
        public V put(K k, V v) {
               if(root == null){
                  root = inserthelp(root, k, v);
                  count++;
                  return null;
               }
               else{
                  if(get(k) == null){
                     root = inserthelp(root, k, v);
                     count++;
                     return null;
                  }
                  else{
                     int ogVal = get(k);
                     root = inserthelp(root, k, v);
                     count++;
                     return ogVal;
                  }
               }
        }

        /**
         * Remove a record from the tree.
         *
         * @param k
         *            Key value of record to remove.
         * @return Record removed, or null if there is none.
         */
        public V remove(K k) {
                 V temp = findhelp(root, k); // find it
                if (temp != null) {
                        root = removehelp(root, k); // remove it
                        // System.out.println("called removehelp");
                        count--;
                }
                return temp;
        }

        /**
         * Remove/return root node from dictionary.
         *
         * @return The record removed, null if empty.
         */
        public V removeAny() {
                if (root == null)
                        return null;
                V temp = root.value();
                root = removehelp(root, root.key());
                --count;
                return temp;
        }

        /**
         * @return Record with key k, null if none.
         * @param k
         *            The key value to find.
         */
        public V get(K k) {
                return findhelp(root, k);
        }
        
        public boolean contains(K k){
         if(get(k) == null)
            return false;
         return true;
        }

        /** @return Number of records in dictionary. */
        public int size() {
                return count;
        }

        private V findhelp(BSTNode<K, V> rt, K k) {
                if (rt == null)
                        return null;
                if (rt.key().compareTo(k) > 0)
                        return findhelp(rt.left(), k);
                else if (rt.key().compareTo(k) == 0)
                        return rt.value();
                else
                        return findhelp(rt.right(), k);
        }

        private BSTNode<K, V> inserthelp(BSTNode<K, V> rt, K k, V v) {
                if (rt == null)
                        return new BSTNode<K, V>(k, v);
                if (rt.key().compareTo(k) > 0)
                        rt.setLeft(inserthelp(rt.left(), k, v));
                else
                        rt.setRight(inserthelp(rt.right(), k, v));
                return rt;
        }

        private BSTNode<K, V> getmin(BSTNode<K, V> rt) {
                if (rt.left() == null)
                        return rt;
                else
                        return getmin(rt.left());
        }

        private BSTNode<K, V> deletemin(BSTNode<K, V> rt) {
                if (rt.left() == null)
                        return rt.right();

                else {
                        rt.setLeft(deletemin(rt.left()));
                        return rt;
                }
        }

        /**
         * Remove a node with key value k
         *
         * @return The tree with the node removed
         */
        private BSTNode<K, V> removehelp(BSTNode<K, V> rt, K k) {
                if (rt == null)
                        return null;
                if (rt.key().compareTo(k) > 0)
                        rt.setLeft(removehelp(rt.left(), k));
                else if (rt.key().compareTo(k) < 0)
                        rt.setRight(removehelp(rt.right(), k));
                else { // Found it, remove it
                        if (rt.left() == null)
                                return rt.right();
                        else if (rt.right() == null)
                                return rt.left();
                        else { // Two children
                                BSTNode<K, V> temp = getmin(rt.right());
                                rt.setValue(temp.value());
                                rt.setKey(temp.key());
                                rt.setRight(deletemin(rt.right()));
                        }
                }
                return rt;
        }

        /**
         * Creates a list storing the the nodes in the subtree of a node, ordered
         * according to the inorder traversal of the subtree.
         */

        protected void inorderElements(BSTNode<K, V> v, ArrayList<V> elts) {
                // elts.add(v.element());
                if (v.left() != null)
                        inorderElements(v.left(), elts); // recurse on left child
                elts.add(v.value());
                if (v.right() != null)
                        inorderElements(v.right(), elts); // recurse on right child
        }

        /** Returns an iterable collection of the tree nodes. */
        public Iterable<V> values() {
                ArrayList<V> elements = new ArrayList<V>();
                if (size() != 0)
                        inorderElements(root, elements); // assign positions in order
                return elements;
        }

        public Iterable<V> findAll(K k) {
                ArrayList<V> al = new ArrayList<V>();
                findAllhelp(root, k, al);
                return al;
        }

        protected void findAllhelp(BSTNode<K, V> rt, K k, ArrayList<V> BSTNode) {
                if (rt == null)
                        return;
                if (rt.key().compareTo(k) > 0)
                        findAllhelp(rt.left(), k, BSTNode);
                else if (rt.key().compareTo(k) == 0) {
                        BSTNode.add(rt.value());
                        findAllhelp(rt.right(), k, BSTNode);
                } else
                        findAllhelp(rt.right(), k, BSTNode);
        }
        
        public boolean isFull(){
         return false;
        }
        public boolean isEmpty(){
         return count == 0 ? true : false;
        } 
     }
