package Patrones_ISCO.Observer;

import java.util.ArrayList;
import java.util.List;

class NewsAgency {
    private String news;
    private List<Channel> channels = new ArrayList<>();

    public void addObserver(Channel channel) {
        this.channels.add(channel);
    }

    public void removeObserver(Channel channel) {
        this.channels.remove(channel);
    }

    public void setNews(String news) {
        this.news = news;
        for (Channel channel : this.channels) {
            channel.update(this.news);
        }
    }
}
//--------------------------------------------------------------------------------------------------
interface Channel {
    public void update(Object o);
}
//--------------------------------------------------------------------------------------------------
class NewsChannel implements Channel {
    private String news;

    @Override
    public void update(Object news) {
        this.setNews((String) news);
    }

    private void setNews(String news2) {
        this.news = news2;
    }
    String getNews() {
        return news;
    }
    
}
//--------------------------------------------------------------------------------------------------
public class observer {
    public static void main(String[] args) {
        NewsAgency observable = new NewsAgency();
        NewsChannel observer = new NewsChannel();
        
        observable.addObserver(observer);
        observable.setNews("news");
        System.out.println(observer.getNews());
        
    }
}
