package Tasks16;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class MusteriIdareSistemi {
        private List<Musteri> musteriListi;

        public MusteriIdareSistemi() {
            this.musteriListi = new ArrayList<>();
        }

        public void musteriElave(Musteri musteri) {
            musteriListi.add(musteri);
        }

        public void musteriSil(Musteri musteri) {
            musteriListi.remove(musteri);
        }

        public Optional<Musteri> musteriTap(String eposta) {
            return musteriListi.stream()
                    .filter(musteri -> musteri.getEposta().equals(eposta))
                    .findFirst();
        }
        public List<Musteri> musteriler(){
            return musteriListi;
        }
}
