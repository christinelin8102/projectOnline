package com.wiadvance.service;

import com.microsoft.graph.auth.publicClient.UsernamePasswordProvider;
import com.microsoft.graph.models.extensions.IGraphServiceClient;
import com.microsoft.graph.models.extensions.User;
import com.microsoft.graph.requests.extensions.GraphServiceClient;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GraphTokenService {

    public UsernamePasswordProvider getAuthProvider(){

        String client_id="6731de76-14a6-49ae-97bc-6eba6914391e";
        String username="christine.lin@foraicontest.onmicrosoft.com";
        String password="Ae07021502";

        //        String scopes="user.read%20openid%20profile%20offline_access";
        List<String> scopes = new ArrayList<String>();
        scopes.add("user.read");
        scopes.add("openid");
        scopes.add("profile");
        scopes.add("offline_access");

        return new UsernamePasswordProvider(
                client_id,
                scopes,
                username,
                password);
    }


    public void getMyProfile(){

        UsernamePasswordProvider authProvider = getAuthProvider();

        IGraphServiceClient graphClient = GraphServiceClient.builder().authenticationProvider( authProvider ).buildClient();

        User user = graphClient.me()
                .buildRequest()
                .get();
    }
}
