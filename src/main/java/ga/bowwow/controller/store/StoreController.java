package ga.bowwow.controller.store;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import ga.bowwow.service.paging.Page;
import ga.bowwow.service.store.Product;
import ga.bowwow.service.store.StoreService;

@Controller
public class StoreController {
	
	@Autowired
	private StoreService storeService;
	
	public StoreController() {
		System.out.println(">> StoreController() 실행");
	}
	// A. 점포 추가 API(O)
		@RequestMapping(value = "/api/insertStore", method = RequestMethod.GET)
		@ResponseBody
		public Map<String, Object> insertStore(HttpServletRequest request, HttpServletResponse response)
				throws IllegalStateException, IOException {
			Map<String, Object> map = new HashMap<String, Object>();
			Map<String, Object> map2 = new HashMap<String, Object>();

			System.out.println("작성 test");
			ArrayList hours = new ArrayList();
			Map<String, Object> hoursMap = new HashMap<String, Object>();
			hoursMap.put("day", "Monday");
			hoursMap.put("open", "13:00");
			hoursMap.put("close", "23:00");
			hours.add(hoursMap);

			map.put("name", "인어수산");
			map.put("owner", "장인어");
			map.put("descr", "인천소래포구 종합어시장 갑각류센터 인어수산");
			map.put("level2", 2);
			map.put("address", "인천광역시 남동구 논현동 680-1 소래포구 종합어시장 1 층 1 호");
			map.put("phone2", "010-1111-2222");
			map.put("businessTimes", hours);

			ArrayList hours2 = new ArrayList();
			Map<String, Object> hoursMap2 = new HashMap<String, Object>();

			hoursMap2.put("day", "Monday");
			hoursMap2.put("open", "13:00");
			hoursMap2.put("close", "23:00");
			hours2.add(hoursMap2);

			hoursMap2.put("day", "Tuesday");
			hoursMap2.put("open", "14:00");
			hoursMap2.put("close", "23:00");
			hours2.add(hoursMap2);

			map2.put("name", "해적수산");
			map2.put("owner", "박해적");
			map2.put("descr", "노량진 시장 광어, 참돔 등 싱싱한 고퀄 활어 전문 횟집");
			map2.put("level2", 1);
			map2.put("address", "서울 동작구 노량진동 13-8 노량진수산시장 활어 001");
			map2.put("phone2", "010-1234-1234");
			map2.put("businessTimes", hours2);

			System.out.println(map);
			System.out.println(map2);
			int result = storeService.insertStore(map);
			int result2 = storeService.insertStore(map2);
			return map2;
		}

		// B. 점포 휴무일 등록 API(O)
		@ResponseBody
		@RequestMapping(value = "/api/insertHoliday", method = RequestMethod.GET)
		public Map<String, Object> insertHoliday(HttpServletRequest request, HttpServletResponse response)
				throws Exception {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("id", 5);
			map.put("holidays", "2021-05-22");
			map.put("holidays", "2021-05-23");
			int result = storeService.insertHoliday(map);
			System.out.println(result);
			return map;
		}

		// C. 점포 목록 조회 API
		@ResponseBody
		@RequestMapping(value = "/api/getStoreList", method = RequestMethod.GET)
		public Map<String, Object> getStoreList(HttpServletRequest request, HttpServletResponse response) throws Exception {
			Map<String, Object> map = new HashMap<String, Object>();
			map = storeService.getStoreList();
			response.getWriter().print(map);
			return map;
		}

		// D. 점포 상세 정보 조회 API(O)
		@ResponseBody
		@RequestMapping(value = "/api/getStoreDetail")
		public Map<String, Object> getStoreDetail(HttpServletRequest request, HttpServletResponse response) {
			int id = 4;
			Map<String, Object> map = new HashMap<String, Object>();
			map = storeService.getStoreDetail(id);

			return map;
		}

		// E. 점포 삭제 API(O)
		@RequestMapping(value = "/api/deleteStore")
		public void deleteStore(HttpServletRequest request, HttpServletResponse response) {
			System.out.println("deleteStore ");
			System.out.println(request.getParameter("id"));
			int id = 4;
			storeService.deleteStore(id);

			try {
				response.getWriter().print("success");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
}




























