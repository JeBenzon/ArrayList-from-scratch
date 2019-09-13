import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;


public interface Bufferable<memberPlayer> extends Serializable {
        public void add(memberPlayer element);
        public memberPlayer get(int index) throws MyBufferException;
        public int size();
        public void clear();

        public boolean contains(memberPlayer element);
        public memberPlayer remove(memberPlayer element) throws MyBufferException;
        public boolean isEmpty();


        public Iterator<memberPlayer> iterator();
        public boolean addAll(Collection<? extends memberPlayer> collection);
    }

