/*******************************************************************************
 * 2020, All rights reserved.
 *******************************************************************************/
package it.bonfire.ProjectOOP.Model;

/**
 * Class which describes the features of a photo.
 * 
 * @author Arianna Nazzarelli
 * @author Francesco Voto
 * @author Sara Santini
 */
public class Photos {
	/**

	 * It is the identity of a photo.
	 */
	private String id_photos= null;
	
	/**
	 * It is the media_url of a photo.
	 */
	private String media_url = null;

	

	/**
	 * It is the wide of pixel which are taken up by a photo.
	 */
	private int pixelWide = 0;
	
	/**

	 * It is the height of pixel which are taken up by a photo.
	 */
	private int pixelHeight = 0;

	/**
	 * It is the number of bytes which are taken up by a photo.
	 */
	private int nbyte = 0;
	public Photos() {
		
	}

	/**
	 * The constructor.
	 * 
	 * @param id_photos id of photo
	 */
	public Photos(String id_photos) {
		this.id_photos = id_photos;
	}

	/**
	 * The constructor.
	 * @param media_url url of photo
	 * @param id_photos id of photo
	 */
	public Photos(String id_photos, String media_url) {

		this.id_photos = id_photos;
		this.media_url = media_url;
	}

	/**
	 *  Method which sets a value to attribute to Id_Photos.
	 * 
	 * @param id_photos id of photos
	 */
	public void setId_Photos(String id_photos) {
		this.id_photos = id_photos;
	}

	/**
	 * Returns id_photos.
	 * 
	 * @return id_photos
	 */
	public String getId_Photos() {
		return id_photos;
	}

	/**
	 * Method that gives back the PixelHeight.
	 * @return pixelHeight
	 */
	public int getPixelHeight() {
		return pixelHeight;
	}

	/**
	 *  Method which sets a value to attribute to PixelHeight.
	 * 
	 * @param PixelHeight height of pixel
	 */
	public void setPixelHeight(int PixelHeight) {
		this.pixelHeight = PixelHeight;
	}

	/**
	 * Method that gives back the Media_Url.
	 * @return media_url
	 */
	public String getMedia_Url() {
		return media_url;
	}

	/**
	 *  Method which sets a value to attribute to Media_Url.
	 * 
	 * @param Media_url url of photo
	 */
	public void setMedia_Url(String Media_url) {
		this.media_url = Media_url;
	}

	/**
	 * Method that gives back the pixelWide.
	 * @return pixelWide
	 */
	public int getPixelWide() {
		return pixelWide;
	}

	/**
	 * Method which sets a value to attribute to PixelWide.
	 * 
	 * @param PixelWide the pixel wide
	 */
	public void setPixelWide(int PixelWide) {
		this.pixelWide = PixelWide;
	}

	/**
	 * Method that gives back the byte.
	 * @return byte 
	 */
	public int getnByte() {
		return nbyte;
	}

	/**
	 * Method which sets a value to attribute to byte.
	 * 
	 * @param Byte byte of photo
	 */
	public void setnByte(int Byte) {
		this.nbyte = Byte;
	}

	@Override
	/**
	 * Methods which gives back the string of API_Instagram.
	 * 
	 * @return String.
	 */

	public String toString() {

		return "Photos [id_photos=" + id_photos + ", media_url=" + media_url + ", pixelWide=" + pixelWide
				+ ", pixelHeight=" + pixelHeight + ", nbyte=" + nbyte + "]";


	}



	
	
	
	

}
