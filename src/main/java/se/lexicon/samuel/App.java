package se.lexicon.samuel;


import com.sun.java.swing.plaf.windows.WindowsDesktopIconUI;

//main class
class Movie{
        private String name;

        public Movie(String name) {
            this.name = name;
        }
        public String plot(){
            return "no plot here";
        }

    public String getName() {
        return name;
    }
}
    //setting up classes
class Jaws extends Movie{
    //constructor
    public Jaws(){
        super("Jaws");
    }
        public String plot(){
            return "A shark eats lots of people";
        }
}
class IndependenceDay extends Movie{
    public IndependenceDay(){
        super("independence day");
    }
    public String plot(){
        return "Aliens attempt to take over the planet";
    }
}
class MazeRunner extends Movie{
    public MazeRunner(){
        super("MazeRunner");
    }
    public String plot(){
        return "Kids try and escape a maze.";
    }
}
class StarWars extends Movie {
    public StarWars(){
        super("StarWars");
    }
    public String plot(){
        return "Imperial forces try to take over the universe";
    }
}
class Forgetable extends Movie{
    public Forgetable(){
        super("Forgetable");
    }
    //no plot method
}

public class App {
    public static void main( String[] args ) {
        for(int i= 1; i<11; i++){
            Movie movie = randomMovie();
            System.out.println("Movie #" + i + " : " + movie.getName() + "\n" +
                    "plot: " + movie.plot() + "\n");
        }


    }
    public static Movie randomMovie(){
        //multiply by 5 cause double between 0 and 1 is returned...
        // and multiply by 5 gives number bwt 0 and 4 and then plus 1
        int randomNumber = (int)(Math.random() * 5) + 1;
        System.out.println("random number generated was " + randomNumber);
        switch (randomNumber){
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new StarWars();
            case 5:
                return new Forgetable();

        }
        return null;
    }
}
