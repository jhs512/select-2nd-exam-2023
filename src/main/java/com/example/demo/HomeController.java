package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.LinkedHashMap;
import java.util.Map;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {

        Map<Long, Map<Long, Object>> data = new LinkedHashMap() {{
            put(1L, new LinkedHashMap() {{
                put("name", "식물");
                put("sub", new LinkedHashMap<>() {{
                    put(10L, new LinkedHashMap<>() {{
                        put("name", "과일");
                    }});
                    put(11L, new LinkedHashMap<>() {{
                        put("name", "야채");
                    }});

                    put(12L, new LinkedHashMap<>() {{
                        put("name", "채소");
                    }});
                }});
            }});

            put(2L, new LinkedHashMap() {{
                put("name", "동물");

                put("sub", new LinkedHashMap<>() {{
                    put(13L, new LinkedHashMap<>() {{
                        put("name", "포유류");
                    }});
                    put(14L, new LinkedHashMap<>() {{
                        put("name", "유대류");
                    }});

                    put(15L, new LinkedHashMap<>() {{
                        put("name", "갑강류");
                    }});
                }});
            }});
        }};

        model.addAttribute("data", data);

        return "home";
    }
}