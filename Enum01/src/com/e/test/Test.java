package com.e.test;

public class Test {

	/**
	 * ��ͨö��
	 * @author �ȶ�
	 *
	 */
	public enum ColorEnum {
		
        red, green, yellow, blue;
    }
	
	/**
	 * ö������ͨ����һ������Ϊ��������Ժͷ���
	 * @author �ȶ�
	 *
	 */
	public enum SeasonEnum {
        
        spring, summer, autumn, winter; // ö�ٱ���д����ǰ�棬�������ʱ�����

        private final static String position = "���߲�����";

        public static SeasonEnum getSeason() {
            if ("���߲�����".equals(position))
                return spring;
            else
                return winter;
        }
    }
	
	/**
	 * ʵ�ִ��й�������ö��
	 * @author �ȶ�
	 *
	 */
	public enum Gender{
        
        MAN("��"), WOMEN("Ů"); // ͨ�����Ÿ�ֵ�����ұ������һ�����Ժ͹���������ֵʱ���붼��ֵ�򶼲���ֵ������һ���ָ�ֵһ���ֲ���ֵ���������ֵ����д������
        
        private final String value;

        Gender(String value) {
            this.value = value;
        }        
    }
	
	/**
	 * ʵ�ִ��г��󷽷���ö��
	 * @author �ȶ�
	 *
	 */
	public enum OrderState {

        CANCEL {
        	public String getName() {
        		return "��ȡ��";
    		}
    	},
        WAITCONFIRM {
    		public String getName() {
    			return "�����";
			}
		},
        WAITPAYMENT {
			public String getName() {
				return "�ȴ�����";
			}
		},
        ADMEASUREPRODUCT {
			public String getName() {
				return "�������";
			}
		},
        WAITDELIVER {
			public String getName() {
				return "�ȴ�����";
			}
		},
        DELIVERED {
			public String getName() {
				return "�ѷ���";
			}
		},
        RECEIVED {
			public String getName() {
				return "���ջ�";
			}
		};
        
        public abstract String getName();
    }
	
	@org.junit.Test
	public void test() {
		
		//ö����һ�����ͣ����ڶ�������������Ʊ����ĸ�ֵ����ֵʱͨ����ö����.ֵ��ȡ��ö���е�ֵ
		ColorEnum colorEnum = ColorEnum.blue;
        switch (colorEnum) {
        case red:
            System.out.println("color is red");
            break;
        case green:
            System.out.println("color is green");
            break;
        case yellow:
            System.out.println("color is yellow");
            break;
        case blue:
            System.out.println("color is blue");
            break;
        }
        //����ö��
        for(ColorEnum color : ColorEnum.values()){
            System.out.println(color);
        }
        //��ȡö�ٵĸ���
        System.out.println(ColorEnum.values().length);
        //��ȡö�ٵ�����λ�ã�Ĭ�ϴ�0��ʼ
        System.out.println(ColorEnum.red.ordinal());
        System.out.println(ColorEnum.green.ordinal());
        System.out.println(ColorEnum.yellow.ordinal());
        System.out.println(ColorEnum.blue.ordinal());
        
        System.out.println(SeasonEnum.getSeason());
        
        for(Gender gender : Gender.values()){
            System.out.println(gender.value);
        }
        
        for(OrderState order : OrderState.values()){
            System.out.println(order.getName());
        }
	}
}
