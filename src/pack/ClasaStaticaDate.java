package pack;

import java.util.ArrayList;

public class ClasaStaticaDate {
    public static ArrayList<UserP> users=new ArrayList<>();
    public static ArrayList<Film> filme =new ArrayList<>();
    public static ArrayList<Serial> seriale =new ArrayList<>();
    public static ArrayList<Actor> actori1 =new ArrayList<>();
    public static ArrayList<Actor> actori2 =new ArrayList<>();
    public static ArrayList<Actor> actori3 =new ArrayList<>();
    public static ArrayList<Actor> actori4 =new ArrayList<>();
    public static ArrayList<Actor> actori5 =new ArrayList<>();
    public static ArrayList<Actor> actori6 =new ArrayList<>();
    public static ArrayList<Actor> actori7 =new ArrayList<>();

    public static void adaugareActori(){
        Actor a1 = new Actor("Eugenio Derbez");
        Actor a2 = new Actor("Salma Hayek");
        Actor a3 = new Actor("Lauren Swickard");
        Actor a4 = new Actor("Josh Swickard");
        Actor a5 = new Actor("Leonardo DiCaprio");
        Actor a6 = new Actor("Jonah Hill");
        Actor a7 = new Actor("Charlize Theron");
        Actor a8 = new Actor("KiKi Layne");
        Actor a9 = new Actor("Gerard Butler");
        Actor a10 = new Actor("Morgan Freeman");
        Actor a11 = new Actor("Katie Holmes");
        Actor a12 = new Actor("Josh Lucas");
        Actor a13 = new Actor("Vera Farmiga");
        Actor a14 = new Actor("Patrick Wilson");

        ClasaStaticaDate.actori1.add(a1);
        ClasaStaticaDate.actori1.add(a2);
        ClasaStaticaDate.actori2.add(a3);
        ClasaStaticaDate.actori2.add(a4);
        ClasaStaticaDate.actori3.add(a5);
        ClasaStaticaDate.actori3.add(a6);
        ClasaStaticaDate.actori4.add(a7);
        ClasaStaticaDate.actori4.add(a8);
        ClasaStaticaDate.actori5.add(a9);
        ClasaStaticaDate.actori5.add(a10);
        ClasaStaticaDate.actori6.add(a11);
        ClasaStaticaDate.actori6.add(a12);
        ClasaStaticaDate.actori7.add(a13);
        ClasaStaticaDate.actori7.add(a14);

    }


    public static void adaugareFilme(){
        Film f1 = new Film("How to be a latin lover","Comedy","The film follows a man who has spent his whole life married to a rich old woman, and must learn to make it on his own when she kicks him out.",actori1,"13+",2017,"1h 55m");
        Film f2 = new Film("A California Christmas","Romance","Joseph Van Aston lives a carefree life and is the son of a wealthy San Francisco real estate tycoon (his mom). He spends his time womanizing and enjoying his rich lifestyle.",actori2,"13+",2020,"1h 47m");
        Film f3 = new Film("The wolf of wall street","Drama"," It recounts Belfort's perspective on his career as a stockbroker in New York City and how his firm, Stratton Oakmont, engaged in rampant corruption and fraud on Wall Street, which ultimately led to his downfall.",actori3,"18+",2013,"2h 59m");
        Film f4 = new Film("The old guard","Action","Andromache Andy of Scythia, Booker, Joe, and Nicky are centuries-old warriors with regenerative healing abilities who use their vast experience to help people.",actori4,"16+",2020,"2h 5m");
        Film f5 = new Film("Angel has fallen","Action","The plot again follows United States Secret Service agent Mike Banning as he races against time to clear his name after being framed for a drone attack on the President of the United States, Allan Trumbull.",actori5,"16+",2019,"2h");
        Film f6 = new Film("The secret: Dare to dream","Drama","The crux of this film is the belief of one of the lead character in positive thinking which re-ignites the spirits of the second lead character and her family.",actori6,"7+",2020,"1h 48m");
        Film f7 = new Film("The Conjuring","Horror","The Conjuring, centering on the alleged real-life exploits of Ed and Lorraine Warren, a married couple who investigated paranormal events.",actori7,"16+",2013,"1h 51m");
        ClasaStaticaDate.filme.add(f1);
        ClasaStaticaDate.filme.add(f2);
        ClasaStaticaDate.filme.add(f3);
        ClasaStaticaDate.filme.add(f4);
        ClasaStaticaDate.filme.add(f5);
        ClasaStaticaDate.filme.add(f6);
        ClasaStaticaDate.filme.add(f7);

    }
}
