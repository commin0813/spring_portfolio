<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<script src="/js/timeline.min.js"></script>
<script>
	timeline(document.querySelectorAll('.timeline'), {
		forceVerticalMode : 700,
		mode : 'horizontal',
		verticalStartPosition : 'left',
		visibleItems : 5
	});
</script>
<script type="text/javascript">
	var _gaq = _gaq || [];
	_gaq.push([ '_setAccount', 'UA-36251023-1' ]);
	_gaq.push([ '_setDomainName', 'jqueryscript.net' ]);
	_gaq.push([ '_trackPageview' ]);

	(function() {
		var ga = document.createElement('script');
		ga.type = 'text/javascript';
		ga.async = true;
		ga.src = ('https:' == document.location.protocol ? 'https://ssl'
				: 'http://www')
				+ '.google-analytics.com/ga.js';
		var s = document.getElementsByTagName('script')[0];
		s.parentNode.insertBefore(ga, s);
	})();
</script>


<script src="/js/animation.js"></script>
<section class="jumbotron text-center" id="contact" style="margin-bottom: 0">
	<p>
		<b>phone:</b> 010-6556-2717
	</p>
	<p>
		<b>email:</b> commin0813@gmail.com
	</p>
	<p>
		<b>Created by 김형민</b>
	</p>
</section>
</body>
</html>