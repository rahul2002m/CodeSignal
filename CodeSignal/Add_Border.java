String[] addBorder(String[] picture) {
       String s="*";
       List<String>rg=new ArrayList<String>();
       rg.add(s.repeat(picture[0].length()+2));
        for(int i=0;i<picture.length;i++){
            rg.add(s+picture[i]+s);
        }
        rg.add(s.repeat(picture[0].length()+2));
        return rg.toArray(new String[0]);
}