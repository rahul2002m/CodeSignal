boolean chessBoardCellColor(String cell1, String cell2) {

        int x1 = cell1.charAt(0) - 'A'; 
	    int y1= cell1.charAt(1)-'0';
	    int x2 = cell2.charAt(0) - 'A';
	    int y2= cell2.charAt(1)-'0';
	    
	    return (x1 + x2) % 2 == (y1 + y2) % 2;
}
