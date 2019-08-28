class Smth{
    double num;
    public Smth next=null;
    
    public Smth(double n){
        num=n;
    }
    
}

class LinkedList<T extends Smth>{
    int numOfNodes=0;
    private T head=null;
    
    public void add(T item){
        if(numOfNodes==0){
            head=item;
            numOfNodes++;
        }
        else{
            T current=head;
            for(int i=0;i<numOfNodes;i++){
                
                
                if(current.next!=null){
                    current=(T)current.next;
                }
                else{
                    current.next=item;
                    numOfNodes++;
                    break;
                }
                
            }
        }
    }
    public void show(){
        T current=head;
        for(int i=0;i<numOfNodes;i++){
            System.out.println(current.num);
            if(current.next==null){
                break;
            }
            else{
                current=(T)current.next;
            }
        }
    }
    
}



public class SinglyLinkedList {
    
    
    public static void main(String args[]) {
        Smth sm=new Smth(2.3);
        LinkedList<Smth> ll=new LinkedList<>();
        ll.add(sm);
        ll.add(new Smth(3.4));
        ll.show();
        
    }
}
