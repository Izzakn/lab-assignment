package ASS1;

    class LibraryItem {
    private String title;
    private String author;
    private int year;
    private boolean isBorrowed;
    private  LibraryItemType itemType;

    public LibraryItem(String title, String author, int year, boolean isBorrowed, LibraryItemType itemType) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.isBorrowed = isBorrowed;
        this.itemType = itemType;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }

    public LibraryItemType getItemType() {
        return itemType;
    }

    public void setItemType(LibraryItemType itemType) {
        this.itemType = itemType;
    }

        @Override
        public String toString() {
            return "LibraryItem{" +
                    "title='" + title + '\'' +
                    ", author='" + author + '\'' +
                    ", year=" + year +
                    ", isBorrowed=" + isBorrowed +
                    ", itemType=" + itemType +
                    '}';
        }
        public boolean equals(Object obj) {
            LibraryItem item = (LibraryItem) obj;
            return (this.title == item.getTitle() && this.author == item.getAuthor() && this.year == item.getYear() &&
                    this.isBorrowed == item.isBorrowed() && this.itemType == item.getItemType()) ? true : false;

    }}
