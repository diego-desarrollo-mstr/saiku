package org.saiku.repository;

<<<<<<< HEAD
=======
import java.io.Serializable;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

>>>>>>> tag-3.16.1
import org.springframework.context.ApplicationListener;
import org.springframework.security.web.session.HttpSessionCreatedEvent;

import java.io.Serializable;

import javax.servlet.http.HttpSession;

/**
 * Created by bugg on 06/05/16.
 */
public class ScopedRepo implements ApplicationListener<HttpSessionCreatedEvent>, Serializable {
<<<<<<< HEAD
  private static final long serialVersionUID = -8379337850087195764L;
  private HttpSession httpSession;

  public ScopedRepo() {

  }

  public void onApplicationEvent(HttpSessionCreatedEvent sessionEvent) {
    /*
     * In our previous implementation we just fetched a session from the
     * RequestContextHolder, but in a SpringSecurity + Hazelcast scenario we need a
     * Hazelcast enabled session which is injected just after the spring security
     * session is created.
     */
    this.setSession(sessionEvent.getSession());
  }

  public void setSession(HttpSession httpSession) {
    this.httpSession = httpSession;
  }

  public HttpSession getSession() {
    return this.httpSession;
  }
=======
    static final long serialVersionUID = 1L;

    private transient HttpSession httpSession;

    public ScopedRepo() {

    }
    
    public void onApplicationEvent(HttpSessionCreatedEvent sessionEvent) {
      /*
       * In our previous implementation we just fetched a session from the RequestContextHolder, but in a 
       * SpringSecurity + Hazelcast scenario we need a Hazelcast enabled session which is injected just after the
       * spring security session is created.
       */
      this.setSession(sessionEvent.getSession());
    }
    
    public void setSession(HttpSession httpSession){
        this.httpSession = httpSession;
    }

    public HttpSession getSession(){
        return this.httpSession;
    }
>>>>>>> tag-3.16.1
}
