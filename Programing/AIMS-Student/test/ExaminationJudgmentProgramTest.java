import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ExaminationJudgmentProgramTest {
	private ExaminationJudgmentProgram examination;
	@BeforeEach
	void setUp() throws Exception {
		examination = new ExaminationJudgmentProgram(71,80);
	}

	@Test
	public void test() {
		float average = (examination.getMath()+ examination.getPhysics())/2;
		if (average>80 && average<100){
			assertTrue(true);
		}
		if (examination.getMath()>70&& examination.getPhysics()>70 && examination.getMath()<100 &&  examination.getPhysics()<100){
			assertTrue(true);
		}
		fail("Not yet implemented");
	}

}
