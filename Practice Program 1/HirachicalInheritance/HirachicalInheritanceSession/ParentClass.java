package HirachicalInheritanceSession;

public class ParentClass {
	ParentClass() {
		String fname = "Ganesh";
		System.out.println(fname);
	}

	void getParent() {
		int age = 30;
		System.out.println(+age);
	}

	public static class ChildClass extends ParentClass {

		ChildClass() {
			String mname = "Mahadev";
			System.out.println(mname);

		}

		void getChild() {
			int fatherage = 60;
			System.out.println(+fatherage);
		}

		public static class MiniChildClass extends ParentClass {
			MiniChildClass() {
				String lname = "Salunkhe";
				System.out.println(lname);
			}

			void getminiChild() {
				int fatherage = 60;
				System.out.println(+fatherage);
			}
		}

		public static void main(String args[]) {
			MiniChildClass m = new MiniChildClass();
			m.getminiChild();
			m.getParent();
			// Not able to access
			MiniChildClass n = new ChildClass();
			MiniChildClass n = new ParentClass();

			ChildClass c = new ChildClass();
			c.getChild();
			c.getParent();
			// Not able to access
			ChildClass l = new parentClass();
			ChildClass x = new MiniChildClass();

			ParentClass p = new ParentClass();
			p.getParent();
			ParentClass r = new ChildClass();
			r.getParent();
			ParentClass q = new MiniChildClass();
			q.getParent();
		}

	}

}
