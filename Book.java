package ASS1;

   class Book extends LibraryItem {
   private int pageCount;
   public Book(String title, String author, int year, boolean isBorrowed, LibraryItemType itemType,int pageCount) {
      super(title, author, year, isBorrowed, itemType.Book) ;
      this.pageCount = pageCount;
   }
   public int getPageCount() {
      return pageCount;
   }
   public void setPageCount(int pageCount) {
      this.pageCount = pageCount;
   }

      @Override
      public String toString() {
         return "Book{" +
                 "pageCount=" + pageCount +
                 '}';
      }
   }
