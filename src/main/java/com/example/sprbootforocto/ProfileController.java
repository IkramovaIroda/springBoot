package com.example.sprbootforocto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@Getter
@Setter
@NoArgsConstructor
@RestController
@RequestMapping("/")
public class ProfileController {
    private  SystemProfile profile;

    public ProfileController(SystemProfile systemProfile) {
        this.profile = systemProfile;
    }

    @GetMapping("profile")
    public String getProfile() {
        return profile.getProfile();
    }
}