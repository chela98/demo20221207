package tr.edu.medipol.yova.OgrenciWebServisi;

import org.springframework.web.bind.annotation.*;
import java.util.*; 

@RestController
@RequestMapping("/ogrenci")
public class OgrenciRestApi {

	private static final List<String> OGRENCILER = new ArrayList<>();
	{
		OGRENCILER.add("Jane");
		OGRENCILER.add("Joe");
	}
	
	@GetMapping("/Listele")
	public List<String> Listele() {
		return OGRENCILER;
	}

}
