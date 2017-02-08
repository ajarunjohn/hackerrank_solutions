class MyBook extends Book {
    int p;
    
    MyBook(String t,String a, int p) {
        super(t, a);
        this.p = p;
    }
    
    void display() {
        System.out.println("Title: "+ title);
        System.out.println("Author: "+ author);
        System.out.println("Price: "+ p);
    }
}
