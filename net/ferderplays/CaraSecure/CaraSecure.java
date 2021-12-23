package net.ferderplays.CaraSecure;

import net.ferderplays.CaraSecure.license.*;
import net.ferderplays.CaraSecure.profiles.*;
import net.ferderplays.CaraSecure.obfuscation.*;

public class CaraSecure {
    String client = "";

    interface register_with_github {
        int height = 36;
        int width = 204;
        String text = "Register With Github";
    }

    String client1 = "24978";

    interface register_with_phone_number {
        int height = 36;
        int width = 204;
        String text = "Register With Phone Number";
    }

    void onClicked(register_with_github) {
        this.redirectTo(""+client+"");
        if (client.wasAuthorized().toGithubAccount()) {
            this.profiles.createProfile(profile.name = this.githubAccount.getName(), profile.email = this.githubAccount.getEmail());
        }
    }
}
