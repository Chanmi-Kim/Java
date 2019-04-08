package example;

public class Packer {

	public void packing(Pencil pencil) {
		// 연필을 검수하고 포장한다.
		System.out.printf("포장 전 검수 : %s\n", pencil.info());

		// 흑연 등급(4B, 3B, 2B, B, HB, H, 2H, 3H, 4H)
		if (pencil.getHardness().equals("4B") || pencil.getHardness().equals("3B") || pencil.getHardness().equals("2B")
				|| pencil.getHardness().equals("B") || pencil.getHardness().equals("HB")
				|| pencil.getHardness().equals("H") || pencil.getHardness().equals("2H")
				|| pencil.getHardness().equals("3H") || pencil.getHardness().equals("4H")) {
			Pencil.setPencilCount(Pencil.getPencilCount() + 1);
			System.out.println("포장을 완료했습니다.\n");
		} else {
			System.out.println("포장을 실패했습니다.\n");
		}
	}

	public void packing(Eraser eraser) {
		// 지우개를 검수하고 포장한다.
		System.out.printf("포장 전 검수 : %s\n", eraser.info());

		// 지우개크기(Large, Medium, Small)
		if (eraser.getSize().equals("Large") || eraser.getSize().equals("Medium") || eraser.getSize().equals("Small")) {
			Eraser.setEraserCount(Eraser.getEraserCount() + 1);
			System.out.println("포장을 완료했습니다.\n");
		} else {
			System.out.println("포장을 실패했습니다.\n");
		}
	}

	public void packing(BallPointPen ballPointPen) {
		// 볼펜을 검수하고 포장한다.
		System.out.printf("포장 전 검수 : %s\n", ballPointPen.info());

		// 볼펜 심 두께(0.3mm, 0.5mm, 0.7mm, 1mm, 1.5mm)
		if (ballPointPen.getThickness() == 0.3 || ballPointPen.getThickness() == 0.5
				|| ballPointPen.getThickness() == 0.7 || ballPointPen.getThickness() == 1
				|| ballPointPen.getThickness() == 1.5) {
			// 볼펜 색상(red, blue, green, black)
			if (ballPointPen.getColor().equals("red") || ballPointPen.getColor().equals("blue")
					|| ballPointPen.getColor().equals("green") || ballPointPen.getColor().equals("black")) {
				BallPointPen.setBallPointPenCount(BallPointPen.getBallPointPenCount() + 1);
				System.out.println("포장을 완료했습니다.\n");
			} else {
				System.out.println("포장을 실패했습니다.\n");
			}
		} else {
			System.out.println("포장을 실패했습니다.\n");
		}
	}

	public void packing(Ruler ruler) {
		// 자를 검수하고 포장한다.
		System.out.printf("포장 전 검수 : %s\n", ruler.info());

		// 자 길이(30cm, 50cm, 100cm)
		if (ruler.getLength() == 30 || ruler.getLength() == 50 || ruler.getLength() == 100) {
			// 자 형태(줄자, 운형자, 삼각자)
			if (ruler.getShape().equals("줄자") || ruler.getShape().equals("운형자") || ruler.getShape().equals("삼각자")) {
				Ruler.setRulerCount(Ruler.getRulerCount() + 1);
				System.out.println("포장을 완료했습니다.\n");
			} else {
				System.out.println("포장을 실패했습니다.\n");
			}
		} else {
			System.out.println("포장을 실패했습니다.\n");
		}
	}

	public void countPacking(int type) {
		// 포장한 내용물 개수를 출력한다.

		System.out.print("\n=====================");
		System.out.print("\n포장 결과");
		System.out.println("\n=====================");

		switch (type) { // 출력할 내용물의 종류
		case 0: // 모든 내용물
			System.out.printf("연필 %d회\n", Pencil.getPencilCount());
			System.out.printf("지우개 %d회\n", Eraser.getEraserCount());
			System.out.printf("볼펜 %d회\n", BallPointPen.getBallPointPenCount());
			System.out.printf("자 %d회\n", Ruler.getRulerCount());
			break;
		case 1: // 연필
			System.out.printf("연필 %d회\n", Pencil.getPencilCount());
			break;
		case 2: // 지우개
			System.out.printf("지우개 %d회\n", Eraser.getEraserCount());
			break;
		case 3: // 볼펜
			System.out.printf("볼펜 %d회\n", BallPointPen.getBallPointPenCount());
			break;
		case 4: // 자
			System.out.printf("자 %d회\n", Ruler.getRulerCount());
			break;
		}
	}
}
