package ASS1;
    class Library {
    private LibraryItem[] items;
    private int Counter= 0;

    public Library() {
        items = new LibraryItem[50];
    }

    public void addItem(LibraryItem item) {
        if (Counter < items.length) {
            items[Counter] = item;
            Counter++;

        }
    }

    public void borrowItem(LibraryItem item) {
        for (int i = 0; i < Counter; i++) {
            if (items[i].equals(item) && !items[i].isBorrowed()) {
                items[i].setBorrowed(true);
                System.out.println("borrowed: " + items[i].getTitle());
                return;
            }
        }
    }
        void returnItem(LibraryItem item){
            for(int i = 0;i < items.length;i ++){
                if(items[i] != null) {
                    if (items[i].getTitle().equals(item.getTitle())) {
                       items[i].setBorrowed(false);
                    }
                }
            }
        }


        public void displayAvailableItems() {
        for (int i = 0; i < Counter; i++) {
            if (!items[i].isBorrowed()) {
                System.out.println(items[i].getTitle());
            }
        }
    }

    public void displayBorrowedItems() {
        for (int i = 0; i < Counter; i++) {
            if (items[i].isBorrowed()) {
                System.out.println(items[i].getTitle());
            }
        }
    }
}