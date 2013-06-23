/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entity.db2;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author eiryu
 */
@Entity
public class Sample implements Serializable {
    @Id
    private String key;
    private String value;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
