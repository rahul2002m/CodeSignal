boolean areEquallyStrong(int yourLeft, int yourRight, int friendsLeft, int friendsRight) {
   boolean a=Integer.max(yourLeft, yourRight)==Integer.max(friendsRight,friendsLeft);
   boolean b=Integer.min(yourLeft, yourRight)==Integer.min(friendsRight,friendsLeft);
   return a&&b;
}
