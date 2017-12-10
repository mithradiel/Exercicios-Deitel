package q_8_10;

	public enum TraficLight2{
		GREEN(10),RED(10),YELLOW(3);
		private int duracao;
		TraficLight2(int duracao){
			this.duracao = duracao;
		}
		
		public int getDuracao() {
			return this.duracao;
		}
		
	}


