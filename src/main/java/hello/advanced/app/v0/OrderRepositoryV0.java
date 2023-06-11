package hello.advanced.app.v0;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class OrderRepositoryV0 {
    public void save(String itemId) {
        //itemId=ex 일 경우에 강제로 예외 던지기
        if(itemId.equals("ex")) {
            throw new IllegalStateException("error!!");
        }
        // 상품 저장하는 1초 걸린다고 가정
        sleep(1000);
    }

    private void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
