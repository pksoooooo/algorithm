class MyHashMap {

    private static class Node {
        private int key;
        private int value;
        Node next;

        public Node(int key, int value){
            this.key = key;
            this.value = value;
        }

    }

    private final int SIZE = 100000;
    private Node[] table;


    public MyHashMap() {
        this.table = new Node[SIZE];
    }

    private int hash(int key){
        return key % SIZE;
    }
    
    public void put(int key, int value) {
        int index = hash(key);
        Node head = table[index];

        if(head == null){
            table[index] = new Node(key, value);
        }
        Node curr = head;

        while(curr != null){
            if(curr.key == key){
                curr.value = value;
                return;
            }

            if(curr.next == null){
                curr.next = new Node(key, value);
            }

            curr = curr.next;
        }

    }
    
    public int get(int key) {

        int index = hash(key);
        Node curr = table[index];

        while(curr != null){
            if(curr.key == key){
                return curr.value;
            }

            curr = curr.next;
        }
        return -1;
    }
    
    public void remove(int key) {

        int index = hash(key);
        Node curr = table[index];
        Node prev = null;

        while(curr != null){

            if(curr.key == key){
                if(prev == null){
                    table[index] = curr.next;
                }else{
                    prev.next = curr.next;
                }
                return;

            }

            prev = curr;
            curr = curr.next;
        }
        
    }
}