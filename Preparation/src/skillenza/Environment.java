package skillenza;

public class Environment {
	public enum TerrainType {
		DIRT, water, rock, sand;
	}
	
	private int temperature, humidity;
	private boolean solar_flare, storm;
	private TerrainType[][] area_map;
	
	//Constructor
	public Environment(int temperature, int humidity, boolean solar_flare, boolean storm, TerrainType[][] area_map) {
		super();
		this.temperature = temperature;
		this.humidity = humidity;
		this.solar_flare = solar_flare;
		this.storm = storm;
		this.area_map = area_map;
		
		this.area_map[0][0] = TerrainType.DIRT;
	}
	
	//Getters And Setters
	public int getTemperature() {
		return temperature;
	}
	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}
	public int getHumidity() {
		return humidity;
	}
	public void setHumidity(int humidity) {
		this.humidity = humidity;
	}
	public boolean isSolar_flare() {
		return solar_flare;
	}
	public void setSolar_flare(boolean solar_flare) {
		this.solar_flare = solar_flare;
	}
	public boolean isStorm() {
		return storm;
	}
	public void setStorm(boolean storm) {
		this.storm = storm;
	}
	public TerrainType[][] getArea_map() {
		return area_map;
	}
	
}
