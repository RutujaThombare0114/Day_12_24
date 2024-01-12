public  class LL{
 node head;
 node tail;
 int size;
 public LL(){
 int size=0;
}

 class node{
  node next;
  int data;

  public node(int data){
     this.data=data;
}
}

public void insertFirst(int d){
   node n=new node(d);
   if(head==null){
  head=tail=n;
}
   n.next=head;
    head=n;
size++;
}

public void insertAfter(int key, int data){
node N=find(key);

  if(N==null){
   System.out.println("key not found");
}
else{
      node n=new node(data);
      N.next=n.next;
      N.next=n;
     size++;
}
}

public void printLL(){
    node temp=head;
   while(temp!=null){
     System.out.print(temp.data+" >> ");
  temp=temp.next;
}
   System.out.println();
}



node find(int key){
  node temp=head;
 while(temp!=null){
     if(temp.data==key){
  return temp;
}
  temp=temp.next;
} return null;
}

public void deleteFirst(){
node temp;
if(head==null){
   System.out.println("list is empty");
}
else{
   temp=head;
   head=temp.next;
   System.out.println("deleted node is  "+temp.data);
}
}

public void deleteAfter(int key){
 node N=find(key);
if(N==null){
System.out.println("node not found");
}
else{
node temp=N.next;
 N.next=temp.next;
System.out.println("deleted node is  "+temp.data);
}
}

public static void main(String args[]){
 LL l=new LL();
 l.insertFirst(89);
 l.insertFirst(67);
 l.insertAfter(89,90);
l.printLL();
l.deleteAfter(67);
l.printLL();

}


}
