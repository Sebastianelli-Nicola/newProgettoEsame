/*******************************************************************************
 * 2020, All rights reserved.
 *******************************************************************************/
package it.bonfire.ProjectOOP.Filters;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;

import javax.imageio.ImageIO;

import it.bonfire.ProjectOOP.Model.API_Instagram;
import it.bonfire.ProjectOOP.Model.Album;
import it.bonfire.ProjectOOP.Model.Fotografia;
import it.bonfire.ProjectOOP.Model.Image;
import it.bonfire.ProjectOOP.Others.Parsing;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of FilterImageName.
 * 
 * @author Arianna Nazzarelli
 * @author Sara Santini
 * @author Francesco Voto
 */
public class Filter {
	HashSet<API_Instagram> collezione;
	Parsing par;
	/**
	 * The constructor.
	 */

	public Filter(HashSet<API_Instagram> collezione) {
		super();
		this.collezione = collezione;
		 par=new Parsing();
	}

	public void sortPhotos() throws IOException{
		new File(par.getDir()+"\\FotoMeno100kb").mkdir();
		new File(par.getDir()+"\\FotoPiu100kb").mkdir();
	     int n=1;
	   Iterator<API_Instagram> p= collezione.iterator();
		while(p.hasNext()) {
			API_Instagram appoggio = p.next();
			if (appoggio.getMedia_type().equals("CAROUSEL_ALBUM")) {
				Album album = (Album) appoggio;
				Iterator<Fotografia> a = album.getFotografias().iterator();
			while (a.hasNext()) {
					Fotografia appoggio1 =a.next();
					File photo = new File(par.getDir()+"\\Album"+n+"\\" +appoggio1.getId_photos()+".jpg" ); 
					BufferedImage image = ImageIO.read(photo);
					if (appoggio1.getnByte()<102400) {
					
					File photo2=new File(par.getDir()+"\\FotoMeno100kb\\"+ appoggio1.getId_photos()+".jpg"); 
					ImageIO.write(image, "jpg", photo2);
				
				
				}
			else {
				
				File photo2= new File(par.getDir()+"\\FotoPiu100kb\\"+ appoggio1.getId_photos()+".jpg"); 
				ImageIO.write(image, "jpg", photo2);
				
			}
				
			}
			n++;
			}
				else {
					Image image= (Image) appoggio;
					File photo = new File(par.getDir()+"\\"+ image.getId()+".jpg"); 
					BufferedImage image1 = ImageIO.read(photo);
					if (image.getFotografias().getnByte()<102400) {
						File photo2=new File(par.getDir()+"\\FotoMeno100kb\\" + image.getId()+".jpg");
						ImageIO.write(image1, "jpg", photo2);
						
					}
				else {
					File photo2=new File(par.getDir()+"\\FotoPiu100kb\\" + image.getId()+ ".jpg");
					ImageIO.write(image1, "jpg", photo2);
				
					
				}
	   
	   
   }
		}}
	
public void PhotosWithHashtag(HashSet<API_Instagram> collezione) throws IOException{
	Iterator<API_Instagram> iter= collezione.iterator();
	new File(par.getDir()+"\\PhotosWithHashtag").mkdir();
	
	Parsing pars=new Parsing();
	while(iter.hasNext()) {
	 API_Instagram api= iter.next();
	 if(api.getCaption()!=null && api.getCaption().contains("#") ) {
		 if(api.getClass().equals(Image.class)) {
			  Image image= (Image) api;
			  File file= new File(par.getDir()+"\\PhotosWithHashtag\\"+ image.getId()+".jpg");
			  pars.Download(image, file);
			  
			 
			 
		 }
		 else {
			 Album album= (Album)api;
			 File file= new File(par.getDir()+"\\PhotosWithHashtag");
			 pars.Download(album, file);
		 }
	 }
	 
	}
}






}

