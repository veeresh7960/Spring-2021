package com.xworkz.applicationinfo.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.applicationinfo.Entity.ApplicationEntity;
import com.xworkz.applicationinfo.Entity.HistoricalPlaceEntity;
import com.xworkz.applicationinfo.Entity.KabbaddiEntity;
import com.xworkz.applicationinfo.Entity.ManumentEntity;
import com.xworkz.applicationinfo.Entity.MineralEntity;
import com.xworkz.applicationinfo.Entity.NationalForestEntity;
import com.xworkz.applicationinfo.Entity.ShirtEntity;
import com.xworkz.applicationinfo.Entity.TvChannelEntity;
import com.xworkz.applicationinfo.Entity.VesselEntity;
import com.xworkz.applicationinfo.Entity.VirusEntity;
import com.xworkz.applicationinfo.Service.ApplicationService;
import com.xworkz.applicationinfo.Service.HistoricalPlaceService;
import com.xworkz.applicationinfo.Service.KabbaddiService;
import com.xworkz.applicationinfo.Service.ManumentService;
import com.xworkz.applicationinfo.Service.MineralService;
import com.xworkz.applicationinfo.Service.NationalForestService;
import com.xworkz.applicationinfo.Service.ShirtService;
import com.xworkz.applicationinfo.Service.TvChannelService;
import com.xworkz.applicationinfo.Service.VesselService;
import com.xworkz.applicationinfo.Service.VirusService;
import com.xworkz.applicationinfo.constants.ApplicationType;

public class ApplicationInfoTester {

	public static void main(String[] args) {

		ApplicationContext container = new ClassPathXmlApplicationContext("application.db.xml");
//		ApplicationService service = container.getBean(ApplicationService.class);
//		HistoricalPlaceService service2 = container.getBean(HistoricalPlaceService.class);
//		KabbaddiService service3 = container.getBean(KabbaddiService.class);
//		ManumentService service4 = container.getBean(ManumentService.class);
//		MineralService service5 = container.getBean(MineralService.class);
//		NationalForestService service6 = container.getBean(NationalForestService.class);
//		ShirtService service7 = container.getBean(ShirtService.class);
//		TvChannelService service8 = container.getBean(TvChannelService.class);
		VesselService service9 = container.getBean(VesselService.class);
		VirusService service10 = container.getBean(VirusService.class);

//		ApplicationEntity entity = new ApplicationEntity(1, "Jilabi", 2.0, 2, "MoonFrog", ApplicationType.GAME);
//		HistoricalPlaceEntity entity2 = new HistoricalPlaceEntity(1, "Hampi", "Ballari", 100, "VirupakshaTemple",
//				"Karnataka");
//		KabbaddiEntity entity3 = new KabbaddiEntity(1, "BangloreBulls", ApplicationType.OUTDOOR, "Banglore", 7,
//				"karnataka");
//		ManumentEntity entity4 = new ManumentEntity(1, "Gol Gumbaz", "Bijapur", "Yaqut of Dabul", 1646, 51);
//		MineralEntity entity5 = new MineralEntity(1, "Silver", "Matalic Gray", "InSoluble", 4, true);
//		NationalForestEntity entity6 = new NationalForestEntity(1, "Gangotri", "Uttarakand", 600, "Uttarakand", 2390);
//		ShirtEntity entity7 = new ShirtEntity(1, "blue", 100, "cotton", "Raymmond", 1000, 20);
//		TvChannelEntity entity8 = new TvChannelEntity(1, "PublicTv", 260, "news", true, "Ranganna", "HD");
		VesselEntity entity9 = new VesselEntity(1, "MS Sympony of the Seas", "White", "Royal carribian International",
				228081, "Royal carribian International people");
		VirusEntity entity10 = new VirusEntity(1, "Maleriya", "cone-shaped core", "retrovirus", 120, "antiRetoviral",
				"highlyProActive");
//		service.validateAndSave(entity);
//		service2.ValidateAndSave(entity2);
//		service3.ValidateAndSave(entity3);
//		service4.ValidateAndSave(entity4);
//		service5.ValidateAndSave(entity5);
//		service6.ValidateAndsave(entity6);
//		service7.ValidateAndSave(entity7);
//		service8.ValidateAndSave(entity8);
		service9.ValidateAndSave(entity9);
		service10.ValidateAndSave(entity10);

	}
}
