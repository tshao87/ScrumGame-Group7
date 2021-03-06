
public class Configuration {
	private int numberOfTeams = 0;
	private String boardLenght = "";
	private boolean isMusicOn = true;
	private boolean isAboutUsInitialized = false;
	private boolean isRulesInitialized = false;

	public Configuration() {
	}

	public int getNumberOfTeams() {
		return numberOfTeams;
	}

	public void setNumberOfTeams(int numberOfTeams) {
		this.numberOfTeams = numberOfTeams;
	}

	public String getBoardLenght() {
		return boardLenght;
	}

	public void setBoardLenght(String boardLenght) {
		this.boardLenght = boardLenght;
	}

	public boolean isMusicOn() {
		return isMusicOn;
	}

	public void setMusicOn(boolean isMusicOn) {
		this.isMusicOn = isMusicOn;
	}

	public void toggleMusic() {
		this.isMusicOn = !this.isMusicOn;
	}

	public boolean isAboutUsInitialized() {
		return isAboutUsInitialized;
	}

	public void setAboutUsStatus(boolean status) {
		this.isAboutUsInitialized = status;
	}

	public boolean isRulesInitialized() {
		return isRulesInitialized;
	}

	public void setRulesStatus(boolean status) {
		this.isRulesInitialized = status;
	}
}
