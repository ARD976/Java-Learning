package oops.interfaceJava;

public interface Youtuber extends VideoEditor {

	void makeVideo();
	
	default void editVideo() {
		System.out.println("Video is complete.");
	}
	
}
