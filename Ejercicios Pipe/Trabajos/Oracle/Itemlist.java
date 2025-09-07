package Oracle;

import io.helidon.common.http.Http;
import io.helidon.webserver.Handler;
import io.helidon.webserver.ServerRequest;
import io.helidon.webserver.ServerResponse;

public class Itemlist implements Handler {
    private Clothing2[] items;

    public Itemlist(Clothing2[] items) {
        this.items = items;
    }

    @Override
    public void accept(ServerRequest req, ServerResponse res){
        res.status(Http.Status.OK_200);
        res.headers().put("Content-type","text/plain; charset=UTF-8");
        StringBuilder result = new StringBuilder();
        for(Clothing2 item:items){
            result.append(item+"/n");
        }
        res.send(result);
    }
}
