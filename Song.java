public class Song {
    protected String m_songName;
    protected String m_artistName;
    protected double m_runtime;


    public Song(){
        m_songName ="song";
        m_artistName ="artist";
        m_runtime = 0.0;
    }

    public Song(String n, String a, double r){
        m_songName = n;
        m_artistName = a;
        m_runtime = r;
    }

    //getters
    public String getSongName(){
        return m_songName;
    }

    public String getSongArtist(){
        return m_artistName;
    }

    public double getSongTime(){
        return m_runtime;
    }

    //setters

    public void setSongName(String new_name){
        m_songName = new_name;
        System.out.println("Song Name updated Successfully!");
    }

    public void setArtistName(String new_Artist){
        m_artistName = new_Artist;
        System.out.println("Artist Name updated Successfully1");
    }

    public void setRuntime(double new_time){
        m_runtime = new_time;
        System.out.println("Runtime Updated Successfully!");
    }

    //toString

    public String toString(){
        String s = "";
        s += m_songName + "by ";
        s += m_artistName +"\n";
        s += m_runtime;
        return s;
    }

    //equals method
    public boolean equals(Object o){
        if (this == o){
            return true;
        }else if (!(o instanceof Song)){
            return false;
        }else{
        Song t = (Song)o;
        return (this.m_songName.equals(t.m_songName) && this.m_artistName.equals(t.m_artistName)&& (this.m_runtime == t.m_runtime));
        }
    }

}

