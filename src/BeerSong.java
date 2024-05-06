public class BeerSong{
    public static void main (String[] args){
        int beerNum=99;
        String word = "bottles";
        while (beerNum>0){

            System.out.println(beerNum+" "+word+" of beer on the wall, "+beerNum+" "+ word+" of beer.");
            beerNum-=1;
            if (beerNum==1){
                word = "bottle";
            }
            System.out.print("Take one and pass it around,");
            if (beerNum>0) {
                System.out.println(beerNum + " " + word + " of beer on the wall.");
                System.out.println("");

            }

        }
        System.out.println(" No more bottles of beer on the wall.");
        System.out.println("");
        //Last two verse
        System.out.println("No more bottles of beer on the wall, No more bottles of beer.");
        System.out.println("Go to the store and buy some more, 99 bottles of beer on the wall.");
    }
}