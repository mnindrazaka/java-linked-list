public class Playlist extends LinkedList<Music> {
    public void addMusic(String title, String performer) {
        super.addNode(new Music(title, performer));
    }

    public void printPlaylist() {
        Node current = this.head;
        int no = 1;

        while(current != null) {
            System.out.println(no + ". " + current.data.getTitle() + " : " + current.data.getPerformer());
            current = current.next;
            no++;
        }
    }

    public void printCurrentMusic() {
        System.out.println("Title : " + current.data.getTitle());
        System.out.println("Performer : " + current.data.getPerformer());
    }
}
