package ASS1;

    class Magazine extends LibraryItem{
    private int issueNumber;
    //String title, String author, int year, boolean isBorrowed, LibraryItemType itemType
        public Magazine(String title, String author, int year,boolean isBorrowed, LibraryItemType itemType, int issueNumber) {

            super(title, author, year, isBorrowed,  itemType.Magazine);

            this.issueNumber = issueNumber;

        }

        public int getIssueNumber() {
            return issueNumber;
        }
        public void setIssueNumber(int issueNumber) {
            this.issueNumber = issueNumber;
        }

        @Override
        public String toString() {
            return "Magazine{" +
                    "issueNumber=" + issueNumber +
                    '}';
        }
    }
