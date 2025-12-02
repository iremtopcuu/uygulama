public class LinkedLists {
    Node head = null;
    Node tail = null;

    void addbegin(int x) {
        Node eleman = new Node();
        eleman.data = x;

        if (head == null) {
            eleman.next = null;
            head = eleman;
            tail = eleman;
            System.out.println("liste oluşturuldu ilk eleman eklendi");
        } else {
            eleman.next = head;
            head = eleman;
            System.out.println("başa  eleman eklendi");
        }
    }

    void addlast(int x) {
        Node eleman = new Node();
        eleman.data = x;

        if (head == null) {
            eleman.next = null;
            head = eleman;
            tail = eleman;
            System.out.println("liste oluşturuldu ilk eleman eklendi");
        } else {
            eleman.next = null;
            tail.next = eleman;
            tail = eleman;
            System.out.println("listenin sonuna eleman eklendi");

        }
    }

    void arayaekle(int index,int x){
        Node eleman=new Node();
        eleman.data=x;

        if(head==null && index==0){
            eleman.next=null;
            head=eleman;
            tail=eleman;
            System.out.println("liste boştu başa eleman eklendi");
        } else if (head!=null && index==0) {
            eleman.next=head;
            head=eleman;
            System.out.println("listenin başına eleman eklendi");

        }else{
            int n=0;
            Node temp=head;

            while (temp!=null && n < index - 1){ //temp’i ekleme yapılacak yerin bir öncesine kadar ilerletir,
                temp=temp.next;
                n++;
            }

            eleman.next=temp.next;
            temp.next=eleman;

            if (eleman.next == null) {
                tail = eleman;
            }
            System.out.println(index + ". sıraya eleman eklendi");





        }
        }

    void bastansil(){
        if (head==null) {
            System.out.println("liste boş silinecek eleman yok");
        }
        else if (head.next==null) {
            head=null;
            tail=null;
            System.out.println("listedeki tek eleman silindi, artık liste boş");
        }else {
            head=head.next;
            System.out.println("listenin başındaki eleman silindi");
        }


    }

    void sondansil(){
        if (head==null){
            System.out.println("liste boş silinecek eleman yok");
        } else if (head.next==null) {
            head=null;
            tail=null;
            System.out.println("listedeki son eleman da silindi");
        }else{
           Node temp=head;
           Node temp2=head;
           while (temp.next!=null){
               temp2=temp;
               temp=temp.next;
           }
           temp2.next=null;
           tail=temp2;
            System.out.println("listenin son elemanı silindi");
        }


    }

    void aradansil(int index) {
        if (head == null) {
            System.out.println("silinecek eleman yok liste boş");
        } else if (head.next == null && index == 0) {
            head = null;
            tail = null;
            System.out.println("listeki tek eleman da silindi");
        } else if (head.next != null && index == 0) {
            head = head.next;
            System.out.println("listenin başındaki eleman silindi");
        } else {
            Node temp = head;
            int n = 0;
            // temp'i silinecek düğümün bir öncesine kadar ilerlet
            while (temp != null && n < index - 1) {
                temp = temp.next;
                n++;
            }
            // Eğer temp null olduysa veya sonraki eleman yoksa: index hatalı
            if (temp == null || temp.next == null) {
                System.out.println("Hatalı indeks! Böyle bir eleman yok.");
                return;
            }
            temp.next = temp.next.next;

            // Eğer sondaki eleman silindiyse, tail’i güncelle
            if (temp.next == null) {
                tail = temp;
            }
            System.out.println(index + ". indeksteki eleman silindi");
        }

        }



        void print () {
            if (head == null) {
                System.out.print("liste boş");
            } else {
                Node temp = head;
                System.out.print("listenin başı ");
                while (temp != null) {
                    System.out.print(temp.data + " >> ");
                    temp = temp.next;
                }
                System.out.println("listenin sonu");
            }
        }

    }
